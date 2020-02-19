/* 
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using avalara.comms.rest.v2.Api;
using avalara.comms.rest.v2.Model;
using avalara.comms.rest.v2.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace avalara.comms.rest.v2.Test
{
    /// <summary>
    ///  Class for testing BundleItem
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class BundleItemTests
    {
        // TODO uncomment below to declare an instance variable for BundleItem
        //private BundleItem instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of BundleItem
            //instance = new BundleItem();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of BundleItem
        /// </summary>
        [Test]
        public void BundleItemInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOf" BundleItem
            //Assert.IsInstanceOf(typeof(BundleItem), instance);
        }


        /// <summary>
        /// Test the property 'TransactionId'
        /// </summary>
        [Test]
        public void TransactionIdTest()
        {
            // TODO unit test for the property 'TransactionId'
        }
        /// <summary>
        /// Test the property 'ServiceId'
        /// </summary>
        [Test]
        public void ServiceIdTest()
        {
            // TODO unit test for the property 'ServiceId'
        }
        /// <summary>
        /// Test the property 'Percentage'
        /// </summary>
        [Test]
        public void PercentageTest()
        {
            // TODO unit test for the property 'Percentage'
        }
        /// <summary>
        /// Test the property 'FixedAmount'
        /// </summary>
        [Test]
        public void FixedAmountTest()
        {
            // TODO unit test for the property 'FixedAmount'
        }
        /// <summary>
        /// Test the property 'Lines'
        /// </summary>
        [Test]
        public void LinesTest()
        {
            // TODO unit test for the property 'Lines'
        }
        /// <summary>
        /// Test the property 'Minutes'
        /// </summary>
        [Test]
        public void MinutesTest()
        {
            // TODO unit test for the property 'Minutes'
        }
        /// <summary>
        /// Test the property 'TransactionDesc'
        /// </summary>
        [Test]
        public void TransactionDescTest()
        {
            // TODO unit test for the property 'TransactionDesc'
        }
        /// <summary>
        /// Test the property 'ServiceDesc'
        /// </summary>
        [Test]
        public void ServiceDescTest()
        {
            // TODO unit test for the property 'ServiceDesc'
        }

    }

}
