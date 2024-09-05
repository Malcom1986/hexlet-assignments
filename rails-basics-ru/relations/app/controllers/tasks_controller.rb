class TasksController < ApplicationController
  def index
    @tasks = Task.all
  end

  def show
    @task = Task.find(params[:id])
  end

  def new
    @task = Task.new
    @users = User.all
    @statuses = Status.all
  end

  def create
    @task = Task.new(task_params)
    if @task.save
      redirect_to tasks_path
    else
      render 'new', status: :unprocessable_entity
    end
  end

  def edit
    @task = Task.find(params[:id])
    @users = User.all
    @statuses = Status.all
  end

  def update
    @task = Task.find(params[:id])
    if @task.update(task_params)
      redirect_to task_path
    else
      render 'edit', status: :unprocessable_entity
    end

  end

  private

  def task_params
    params.require(:task).permit(:name, :description, :user_id, :status_id)
  end
end
