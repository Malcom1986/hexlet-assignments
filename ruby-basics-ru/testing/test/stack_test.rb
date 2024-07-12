# frozen_string_literal: true

require_relative 'test_helper'
require_relative '../lib/stack'

class StackTest < Minitest::Test

  # BEGIN
  def setup
    @stack = Stack.new
  end

  def test_empty_stack
    assert { @stack.empty? }
    assert { @stack.size == 0 }
  end

  def test_stack
    @stack.push! 1
    @stack.push! 2
    assert { @stack.size == 2 }
    @stack.pop!
    assert { @stack.size == 1 }
    @stack.pop!
    assert { @stack.empty? }
  end

  def test_to_array
    @stack.push! 1
    @stack.push! 2
    expected = [1, 2]
    assert { @stack.to_a == expected }
  end

  def test_clear
    @stack.push! 1
    @stack.push! 2
    @stack.clear!
    assert { @stack.empty? }
  end
  # END
end

test_methods = StackTest.new({}).methods.select { |method| method.start_with? 'test_' }
raise 'StackTest has not tests!' if test_methods.empty?
