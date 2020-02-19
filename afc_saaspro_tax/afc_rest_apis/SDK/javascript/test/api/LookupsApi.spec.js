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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SaasPro);
  }
}(this, function(expect, SaasPro) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SaasPro.LookupsApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('LookupsApi', function() {
    describe('apiV2AfcLocationPcodeGet', function() {
      it('should call apiV2AfcLocationPcodeGet successfully', function(done) {
        //uncomment below and update the code to test apiV2AfcLocationPcodeGet
        //instance.apiV2AfcLocationPcodeGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('apiV2AfcPrimaryPCodeGet', function() {
      it('should call apiV2AfcPrimaryPCodeGet successfully', function(done) {
        //uncomment below and update the code to test apiV2AfcPrimaryPCodeGet
        //instance.apiV2AfcPrimaryPCodeGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('apiV2AfcServiceinfoGet', function() {
      it('should call apiV2AfcServiceinfoGet successfully', function(done) {
        //uncomment below and update the code to test apiV2AfcServiceinfoGet
        //instance.apiV2AfcServiceinfoGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('apiV2AfcTaxtypeTaxTypeGet', function() {
      it('should call apiV2AfcTaxtypeTaxTypeGet successfully', function(done) {
        //uncomment below and update the code to test apiV2AfcTaxtypeTaxTypeGet
        //instance.apiV2AfcTaxtypeTaxTypeGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('apiV2AfcTspairsGet', function() {
      it('should call apiV2AfcTspairsGet successfully', function(done) {
        //uncomment below and update the code to test apiV2AfcTspairsGet
        //instance.apiV2AfcTspairsGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
