class Task < ApplicationRecord
  attribute :status, default: 'created'
  attribute :completed, default: false
end
