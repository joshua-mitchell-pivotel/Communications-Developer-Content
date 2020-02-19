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
    ///  Class for testing ReportingInformation
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class ReportingInformationTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for ReportingInformation
        //private ReportingInformation instance;

        public ReportingInformationTests()
        {
            // TODO uncomment below to create an instance of ReportingInformation
            //instance = new ReportingInformation();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ReportingInformation
        /// </summary>
        [Fact]
        public void ReportingInformationInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOfType" ReportingInformation
            //Assert.IsInstanceOfType<ReportingInformation> (instance, "variable 'instance' is a ReportingInformation");
        }


        /// <summary>
        /// Test the property 'Acct'
        /// </summary>
        [Fact]
        public void AcctTest()
        {
            // TODO unit test for the property 'Acct'
        }
        /// <summary>
        /// Test the property 'Custref'
        /// </summary>
        [Fact]
        public void CustrefTest()
        {
            // TODO unit test for the property 'Custref'
        }
        /// <summary>
        /// Test the property 'Invn'
        /// </summary>
        [Fact]
        public void InvnTest()
        {
            // TODO unit test for the property 'Invn'
        }
        /// <summary>
        /// Test the property 'Bcyc'
        /// </summary>
        [Fact]
        public void BcycTest()
        {
            // TODO unit test for the property 'Bcyc'
        }
        /// <summary>
        /// Test the property 'Ccycd'
        /// </summary>
        [Fact]
        public void CcycdTest()
        {
            // TODO unit test for the property 'Ccycd'
        }
        /// <summary>
        /// Test the property 'Ccydesc'
        /// </summary>
        [Fact]
        public void CcydescTest()
        {
            // TODO unit test for the property 'Ccydesc'
        }

    }

}
