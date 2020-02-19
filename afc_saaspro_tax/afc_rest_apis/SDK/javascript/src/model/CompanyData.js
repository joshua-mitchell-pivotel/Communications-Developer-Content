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
import Exclusion from './Exclusion';

/**
 * The CompanyData model module.
 * @module model/CompanyData
 * @version v2
 */
class CompanyData {
    /**
     * Constructs a new <code>CompanyData</code>.
     * Container class for json properties associated with v2.CalcTaxes company data
     * @alias module:model/CompanyData
     */
    constructor() { 
        
        CompanyData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CompanyData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompanyData} obj Optional instance to populate.
     * @return {module:model/CompanyData} The populated <code>CompanyData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompanyData();

            if (data.hasOwnProperty('bscl')) {
                obj['bscl'] = ApiClient.convertToType(data['bscl'], 'Number');
            }
            if (data.hasOwnProperty('svcl')) {
                obj['svcl'] = ApiClient.convertToType(data['svcl'], 'Number');
            }
            if (data.hasOwnProperty('fclt')) {
                obj['fclt'] = ApiClient.convertToType(data['fclt'], 'Boolean');
            }
            if (data.hasOwnProperty('frch')) {
                obj['frch'] = ApiClient.convertToType(data['frch'], 'Boolean');
            }
            if (data.hasOwnProperty('reg')) {
                obj['reg'] = ApiClient.convertToType(data['reg'], 'Boolean');
            }
            if (data.hasOwnProperty('excl')) {
                obj['excl'] = ApiClient.convertToType(data['excl'], [Exclusion]);
            }
            if (data.hasOwnProperty('idnt')) {
                obj['idnt'] = ApiClient.convertToType(data['idnt'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} bscl
 */
CompanyData.prototype['bscl'] = undefined;

/**
 * @member {Number} svcl
 */
CompanyData.prototype['svcl'] = undefined;

/**
 * @member {Boolean} fclt
 */
CompanyData.prototype['fclt'] = undefined;

/**
 * @member {Boolean} frch
 */
CompanyData.prototype['frch'] = undefined;

/**
 * @member {Boolean} reg
 */
CompanyData.prototype['reg'] = undefined;

/**
 * @member {Array.<module:model/Exclusion>} excl
 */
CompanyData.prototype['excl'] = undefined;

/**
 * @member {String} idnt
 */
CompanyData.prototype['idnt'] = undefined;






export default CompanyData;

