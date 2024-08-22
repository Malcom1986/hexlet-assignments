# == Schema Information
#
# Table name: tasks
#
#  id          :integer          not null, primary key
#  name        :string
#  description :text
#  status      :string
#  creator     :string
#  performer   :string
#  completed   :boolean
#  created_at  :datetime         not null
#  updated_at  :datetime         not null
#
class Task < ApplicationRecord
  attribute :status, default: -> { 'new' }
  attribute :completed, default: -> { false }

  validates :name, :status, :creator, presence: true
  validates :completed, inclusion: { in: [true, false] }
end
