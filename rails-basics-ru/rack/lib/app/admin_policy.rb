# frozen_string_literal: true

class AdminPolicy
  def initialize(app)
    @app = app
  end

  def call(env)
    # BEGIN
    request = Rack::Request.new(env)
    pattern = /^\/admin(?:\/\w+)?$/
    if request.path.match?(pattern)
      [403, {"Content-Type" => "text/plain"}, ["Forbidden"]]
    else @app.call(env)
    end
    # END
  end
end
