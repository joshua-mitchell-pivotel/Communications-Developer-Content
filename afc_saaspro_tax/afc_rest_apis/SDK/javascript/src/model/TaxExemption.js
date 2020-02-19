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
import Location from './Location';

/**
 * The TaxExemption model module.
 * @module model/TaxExemption
 * @version v2
 */
class TaxExemption {
    /**
     * Constructs a new <code>TaxExemption</code>.
     * Tax exemption data.
     * @alias module:model/TaxExemption
     */
    constructor() { 
        
        TaxExemption.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TaxExemption</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TaxExemption} obj Optional instance to populate.
     * @return {module:model/TaxExemption} The populated <code>TaxExemption</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TaxExemption();

            if (data.hasOwnProperty('frc')) {
                obj['frc'] = ApiClient.convertToType(data['frc'], 'Boolean');
            }
            if (data.hasOwnProperty('loc')) {
                obj['loc'] = ApiClient.convertToType(data['loc'], Location);
            }
            if (data.hasOwnProperty('tpe')) {
                obj['tpe'] = ApiClient.convertToType(data['tpe'], 'Number');
            }
            if (data.hasOwnProperty('lvl')) {
                obj['lvl'] = ApiClient.convertToType(data['lvl'], 'Number');
            }
            if (data.hasOwnProperty('cat')) {
                obj['cat'] = ApiClient.convertToType(data['cat'], 'Number');
            }
            if (data.hasOwnProperty('dom')) {
                obj['dom'] = ApiClient.convertToType(data['dom'], 'Number');
            }
            if (data.hasOwnProperty('scp')) {
                obj['scp'] = ApiClient.convertToType(data['scp'], 'Number');
            }
            if (data.hasOwnProperty('exnb')) {
                obj['exnb'] = ApiClient.convertToType(data['exnb'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} frc
 */
TaxExemption.prototype['frc'] = undefined;

/**
 * @member {module:model/Location} loc
 */
TaxExemption.prototype['loc'] = undefined;

/**
 * @member {Number} tpe
 */
TaxExemption.prototype['tpe'] = undefined;

/**
 * @member {Number} lvl
 */
TaxExemption.prototype['lvl'] = undefined;

/**
 * @member {Number} cat
 */
TaxExemption.prototype['cat'] = undefined;

/**
 * @member {Number} dom
 */
TaxExemption.prototype['dom'] = undefined;

/**
 * @member {Number} scp
 */
TaxExemption.prototype['scp'] = undefined;

/**
 * @member {Boolean} exnb
 */
TaxExemption.prototype['exnb'] = undefined;






export default TaxExemption;

