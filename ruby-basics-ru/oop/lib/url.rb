# frozen_string_literal: true

# BEGIN
require 'uri'
require 'forwardable'

class Url
  extend Forwardable
  include Comparable

  attr_reader :query_params

  def_delegators :@url, :scheme, :host, :port

  def initialize(url)
    @url = URI(url)
    query = @url.query || ''
    query_string = URI.decode_www_form(query)
    @query_params = query_string.each_with_object({}) do |(key, value), acc|
      acc[key.to_sym] = value
    end
  end

  def query_param(key, default = nil)
    query_params[key] ||= default
  end

  def <=>(other)
    if self.scheme == other.scheme && self.host == other.host && self.port == other.port && self.query_params == other.query_params
      0
    else
      1
    end
  end

end

# END