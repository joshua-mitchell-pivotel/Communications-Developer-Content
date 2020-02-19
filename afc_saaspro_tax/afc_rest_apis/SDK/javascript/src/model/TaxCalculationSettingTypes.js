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
* Enum class TaxCalculationSettingTypes.
* @enum {}
* @readonly
*/
export default class TaxCalculationSettingTypes {
    
        /**
         * value: "All"
         * @const
         */
        "All" = "All";

    
        /**
         * value: "Configuration"
         * @const
         */
        "Configuration" = "Configuration";

    
        /**
         * value: "Bundle"
         * @const
         */
        "Bundle" = "Bundle";

    
        /**
         * value: "Exclusion"
         * @const
         */
        "Exclusion" = "Exclusion";

    
        /**
         * value: "Override"
         * @const
         */
        "Override" = "Override";

    
        /**
         * value: "Nexus"
         * @const
         */
        "Nexus" = "Nexus";

    
        /**
         * value: "Exemption"
         * @const
         */
        "Exemption" = "Exemption";

    

    /**
    * Returns a <code>TaxCalculationSettingTypes</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/TaxCalculationSettingTypes} The enum <code>TaxCalculationSettingTypes</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

