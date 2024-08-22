require "test_helper"

class TasksControllerTest < ActionDispatch::IntegrationTest
  test 'should open root page' do
    get root_path
    assert_response :success
  end

  test 'should open tasks page' do
    get tasks_path
    assert_response :success
  end

  test 'should open task page' do
    expected_task = tasks :one
    get tasks_path(expected_task.id)
    assert_response :success
  end

  test 'should create new task' do
    task = Task.new(
      name: 'test',
      description: 'test desc',
      status: 'in_progress',
      creator: 'Jopa',
      performer: 'Jopa',
      completed: false
    )

    post tasks_path, params: { task: {
      name: 'test',
      description: 'test desc',
      status: 'in_progress',
      creator: 'Jopa',
      performer: 'Jopa',
      completed: false
    } }
    assert_response :redirect

    actual_task = Task.find_by(name: task.name)
    assert_not_nil actual_task
  end
end
