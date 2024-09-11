setup:
	bin/setup
	yarn

start:
	bin/dev

console:
	bin/rails console

test:
	yarn run build > /dev/null
	yarn run build:css > /dev/null
	NODE_ENV=test bin/rails test

.PHONY: test
