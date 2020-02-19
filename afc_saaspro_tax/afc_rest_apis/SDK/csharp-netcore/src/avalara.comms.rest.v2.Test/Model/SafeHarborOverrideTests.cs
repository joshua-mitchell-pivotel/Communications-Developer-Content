/* 
 * SaasPro
 *
 * APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.
 *
 * The version of the OpenAPI document: v2
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

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
    ///  Class for testing SafeHarborOverride
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class SafeHarborOverrideTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for SafeHarborOverride
        //private SafeHarborOverride instance;

        public SafeHarborOverrideTests()
        {
            // TODO uncomment below to create an instance of SafeHarborOverride
            //instance = new SafeHarborOverride();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of SafeHarborOverride
        /// </summary>
        [Fact]
        public void SafeHarborOverrideInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" SafeHarborOverride
            //Assert.IsInstanceOfType<SafeHarborOverride> (instance, "variable 'instance' is a SafeHarborOverride");
        }


        /// <summary>
        /// Test the property 'Sh'
        /// </summary>
        [Fact]
        public void ShTest()
        {
            // TODO unit test for the property 'Sh'
        }
        /// <summary>
        /// Test the property 'Old'
        /// </summary>
        [Fact]
        public void OldTest()
        {
            // TODO unit test for the property 'Old'
        }
        /// <summary>
        /// Test the property 'New'
        /// </summary>
        [Fact]
        public void NewTest()
        {
            // TODO unit test for the property 'New'
        }

    }

}
