# frozen_string_literal: true

require 'test_helper'

class BulletinsControllerTest < ActionDispatch::IntegrationTest
  test 'should access to index page' do
    get bulletins_path
    assert_response :success
    assert_select 'h1', 'Bulletins'
  end

  test 'should access to show page' do
    expected = bulletins(:bullitin1)
    get bulletin_path(expected)
    assert_response :success
    assert_select 'h1', expected.title
    assert_select 'p', expected.body
  end
end
