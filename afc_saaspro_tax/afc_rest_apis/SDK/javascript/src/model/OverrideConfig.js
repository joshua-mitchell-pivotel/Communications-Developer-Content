/**
 * SaasPro
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The OverrideConfig model module.
 * @module model/OverrideConfig
 * @version v2
 */
class OverrideConfig {
    /**
     * Constructs a new <code>OverrideConfig</code>.
     * Settings associated with a client profile override  Maybe associated with 0 to many profiles
     * @alias module:model/OverrideConfig
     */
    constructor() { 
        
        OverrideConfig.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OverrideConfig</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OverrideConfig} obj Optional instance to populate.
     * @return {module:model/OverrideConfig} The populated <code>OverrideConfig</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OverrideConfig();

            if (data.hasOwnProperty('RawData')) {
                obj['RawData'] = ApiClient.convertToType(data['RawData'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Raw data
 * @member {Array.<String>} RawData
 */
OverrideConfig.prototype['RawData'] = undefined;






export default OverrideConfig;

