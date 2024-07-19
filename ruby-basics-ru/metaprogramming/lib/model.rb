# frozen_string_literal: true

# BEGIN
module Model

  def self.included(base)
    base.extend ClassMethods
  end

  module ClassMethods
    def attribute(name, options = {})
      @attributes ||= {}
      @attributes[name] = options[:type]
      attr_reader name
      define_method "#{name}=" do |value|
        self.instance_variable_set  "@#{name}", self.convert_type(value, options[:type])
      end
    end

    def attributes
      @attributes
    end
  end

  def initialize(attributes = {})
    attributes.each do |key, value|
      if self.class.attributes.key?(key)
        send("#{key}=", value)
      end
    end
  end

  def convert_type(value, type)
    return nil if value.nil?

    case type
    when :string
      value.to_s
    when :integer
      value.to_i
    when :boolean
      value
    when :datetime
      DateTime.parse value
    when nil
      value
    else
      raise "Неизвестный тип: #{type}"
    end
  end

  def attributes
    result = {}
    self.class.attributes.each do |attr, _|
      value = self.instance_variable_get "@#{attr}"
      result[attr] = value;
    end
    result
  end
end
