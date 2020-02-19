=begin
#SaasPro

#APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.

The version of the OpenAPI document: v2

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.3.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::HealthCheckApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'HealthCheckApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::HealthCheckApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of HealthCheckApi' do
    it 'should create an instance of HealthCheckApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::HealthCheckApi)
    end
  end

  # unit tests for api_v2_health_check_get
  # Health check that confirms the service is operational and ready to use
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'api_v2_health_check_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
