# frozen_string_literal: true
5.times do
  Task.create(
    name: Faker::Lorem.sentence,
    description: Faker::Lorem.paragraph,
    status: %w[new in_progress done].sample,
    creator: Faker::Name.name,
    performer: Faker::Name.name,
    completed: [true, false].sample,
  )
end
