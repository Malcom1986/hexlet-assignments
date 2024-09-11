# frozen_string_literal: true

Rails.application.routes.draw do
  root 'homes#index'

  # BEGIN
  resources :posts, shallow: true do
    resources :post_comments
  end
  
  # END
end
