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
    @query_params = query_string.to_h.transform_keys { |k| k.to_sym }
  end

  def query_param(key, default = nil)
    query_params.fetch(key, default)
  end

  def <=>(other)
    [scheme, host, port, query_params] <=> [other.scheme, other.host, other.port, other.query_params]
  end
end
# END
