=begin
#SaasPro

#APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.

The version of the OpenAPI document: v2

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.3.0-SNAPSHOT

=end

require 'cgi'

module OpenapiClient
  class CustomizationApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Retrieves one or more profiles with associated settings and configurable items
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :requested_client_id Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable.
    # @option opts [Integer] :requested_profile_id Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set.
    # @option opts [TaxCalculationSettingTypes] :item_type Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All
    # @return [TaxCalculationSettingsResponse]
    def api_v2_profiles_get_profiles_get(opts = {})
      data, _status_code, _headers = api_v2_profiles_get_profiles_get_with_http_info(opts)
      data
    end

    # Retrieves one or more profiles with associated settings and configurable items
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :requested_client_id Client id associated with profile(s) to be fetched  Null value will use client id submitting the request or default client id as applicable.
    # @option opts [Integer] :requested_profile_id Configuration profile id to be fetched  Use 0 to indicate all profiles  Null value will use profile id from request or 0 if not set.
    # @option opts [TaxCalculationSettingTypes] :item_type Item Type  Examples:    Configuration, Bundle, Exclusion, Override, All
    # @return [Array<(TaxCalculationSettingsResponse, Integer, Hash)>] TaxCalculationSettingsResponse data, response status code and response headers
    def api_v2_profiles_get_profiles_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomizationApi.api_v2_profiles_get_profiles_get ...'
      end
      # resource path
      local_var_path = '/api/v2/profiles/GetProfiles'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'RequestedClientId'] = opts[:'requested_client_id'] if !opts[:'requested_client_id'].nil?
      query_params[:'RequestedProfileId'] = opts[:'requested_profile_id'] if !opts[:'requested_profile_id'].nil?
      query_params[:'ItemType'] = opts[:'item_type'] if !opts[:'item_type'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain', 'application/json', 'text/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      # return_type
      return_type = opts[:return_type] || 'TaxCalculationSettingsResponse' 

      # auth_names
      auth_names = opts[:auth_names] || ['Basic']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomizationApi#api_v2_profiles_get_profiles_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Creates or updates bundle packages and associated profile mappings.
    # @param [Hash] opts the optional parameters
    # @option opts [SetTaxCalculationSettingRequest] :set_tax_calculation_setting_request 
    # @return [TaxCalculationSettingsResponse]
    def api_v2_profiles_set_bundles_post(opts = {})
      data, _status_code, _headers = api_v2_profiles_set_bundles_post_with_http_info(opts)
      data
    end

    # Creates or updates bundle packages and associated profile mappings.
    # @param [Hash] opts the optional parameters
    # @option opts [SetTaxCalculationSettingRequest] :set_tax_calculation_setting_request 
    # @return [Array<(TaxCalculationSettingsResponse, Integer, Hash)>] TaxCalculationSettingsResponse data, response status code and response headers
    def api_v2_profiles_set_bundles_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomizationApi.api_v2_profiles_set_bundles_post ...'
      end
      # resource path
      local_var_path = '/api/v2/profiles/SetBundles'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain', 'application/json', 'text/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json-patch+json', 'application/json', 'text/json', 'application/*+json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(opts[:'set_tax_calculation_setting_request']) 

      # return_type
      return_type = opts[:return_type] || 'TaxCalculationSettingsResponse' 

      # auth_names
      auth_names = opts[:auth_names] || ['Basic']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomizationApi#api_v2_profiles_set_bundles_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Creates or updates configuration settings and associated profile mappings.
    # @param [Hash] opts the optional parameters
    # @option opts [SetTaxCalculationSettingRequest] :set_tax_calculation_setting_request 
    # @return [TaxCalculationSettingsResponse]
    def api_v2_profiles_set_config_post(opts = {})
      data, _status_code, _headers = api_v2_profiles_set_config_post_with_http_info(opts)
      data
    end

    # Creates or updates configuration settings and associated profile mappings.
    # @param [Hash] opts the optional parameters
    # @option opts [SetTaxCalculationSettingRequest] :set_tax_calculation_setting_request 
    # @return [Array<(TaxCalculationSettingsResponse, Integer, Hash)>] TaxCalculationSettingsResponse data, response status code and response headers
    def api_v2_profiles_set_config_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomizationApi.api_v2_profiles_set_config_post ...'
      end
      # resource path
      local_var_path = '/api/v2/profiles/SetConfig'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain', 'application/json', 'text/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json-patch+json', 'application/json', 'text/json', 'application/*+json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(opts[:'set_tax_calculation_setting_request']) 

      # return_type
      return_type = opts[:return_type] || 'TaxCalculationSettingsResponse' 

      # auth_names
      auth_names = opts[:auth_names] || ['Basic']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomizationApi#api_v2_profiles_set_config_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Creates or updates exclusions and associated profile mappings.
    # @param [Hash] opts the optional parameters
    # @option opts [SetTaxCalculationSettingRequest] :set_tax_calculation_setting_request 
    # @return [TaxCalculationSettingsResponse]
    def api_v2_profiles_set_exclusions_post(opts = {})
      data, _status_code, _headers = api_v2_profiles_set_exclusions_post_with_http_info(opts)
      data
    end

    # Creates or updates exclusions and associated profile mappings.
    # @param [Hash] opts the optional parameters
    # @option opts [SetTaxCalculationSettingRequest] :set_tax_calculation_setting_request 
    # @return [Array<(TaxCalculationSettingsResponse, Integer, Hash)>] TaxCalculationSettingsResponse data, response status code and response headers
    def api_v2_profiles_set_exclusions_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomizationApi.api_v2_profiles_set_exclusions_post ...'
      end
      # resource path
      local_var_path = '/api/v2/profiles/SetExclusions'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain', 'application/json', 'text/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json-patch+json', 'application/json', 'text/json', 'application/*+json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(opts[:'set_tax_calculation_setting_request']) 

      # return_type
      return_type = opts[:return_type] || 'TaxCalculationSettingsResponse' 

      # auth_names
      auth_names = opts[:auth_names] || ['Basic']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomizationApi#api_v2_profiles_set_exclusions_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Creates or updates overrides and associated profile mappings.
    # @param [Hash] opts the optional parameters
    # @option opts [SetTaxCalculationSettingRequest] :set_tax_calculation_setting_request 
    # @return [TaxCalculationSettingsResponse]
    def api_v2_profiles_set_overrides_post(opts = {})
      data, _status_code, _headers = api_v2_profiles_set_overrides_post_with_http_info(opts)
      data
    end

    # Creates or updates overrides and associated profile mappings.
    # @param [Hash] opts the optional parameters
    # @option opts [SetTaxCalculationSettingRequest] :set_tax_calculation_setting_request 
    # @return [Array<(TaxCalculationSettingsResponse, Integer, Hash)>] TaxCalculationSettingsResponse data, response status code and response headers
    def api_v2_profiles_set_overrides_post_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: CustomizationApi.api_v2_profiles_set_overrides_post ...'
      end
      # resource path
      local_var_path = '/api/v2/profiles/SetOverrides'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['text/plain', 'application/json', 'text/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json-patch+json', 'application/json', 'text/json', 'application/*+json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(opts[:'set_tax_calculation_setting_request']) 

      # return_type
      return_type = opts[:return_type] || 'TaxCalculationSettingsResponse' 

      # auth_names
      auth_names = opts[:auth_names] || ['Basic']

      new_options = opts.merge(
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CustomizationApi#api_v2_profiles_set_overrides_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
