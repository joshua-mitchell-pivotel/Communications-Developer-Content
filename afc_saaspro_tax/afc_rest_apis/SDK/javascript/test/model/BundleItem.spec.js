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
    instance = new SaasPro.BundleItem();
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

  describe('BundleItem', function() {
    it('should create an instance of BundleItem', function() {
      // uncomment below and update the code to test BundleItem
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be.a(SaasPro.BundleItem);
    });

    it('should have the property transactionId (base name: "TransactionId")', function() {
      // uncomment below and update the code to test the property transactionId
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be();
    });

    it('should have the property serviceId (base name: "ServiceId")', function() {
      // uncomment below and update the code to test the property serviceId
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be();
    });

    it('should have the property percentage (base name: "Percentage")', function() {
      // uncomment below and update the code to test the property percentage
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be();
    });

    it('should have the property fixedAmount (base name: "FixedAmount")', function() {
      // uncomment below and update the code to test the property fixedAmount
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be();
    });

    it('should have the property lines (base name: "Lines")', function() {
      // uncomment below and update the code to test the property lines
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be();
    });

    it('should have the property minutes (base name: "Minutes")', function() {
      // uncomment below and update the code to test the property minutes
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be();
    });

    it('should have the property transactionDesc (base name: "TransactionDesc")', function() {
      // uncomment below and update the code to test the property transactionDesc
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be();
    });

    it('should have the property serviceDesc (base name: "ServiceDesc")', function() {
      // uncomment below and update the code to test the property serviceDesc
      //var instane = new SaasPro.BundleItem();
      //expect(instance).to.be();
    });

  });

}));