# frozen_string_literal: true

# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the bin/rails db:seed command (or created alongside the database with db:setup).
#
# Examples:
#
#   movies = Movie.create([{ name: 'Star Wars' }, { name: 'Lord of the Rings' }])
#   Character.create(name: 'Luke', movie: movies.first)
5.times do
  Task.create(
    name: Faker::Name.name,
    description: Faker::Lorem.paragraph,
    status: %w[created in_progress done].sample,
    creator: Faker::Name.name,
    performer: Faker::Name.name,
    completed: [true, false].sample
  )
end