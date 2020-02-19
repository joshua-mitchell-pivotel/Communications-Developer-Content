# coding: utf-8

"""
    SaasPro

    APIs to interface with communications tax engine.<br />The API requires Basic authentication.<br />Users with access to multiple clients must also set request header parameter for <code>client_id</code>.<br />Set <code>client_profile_id</code> to specify profile to be used for taxation.  # noqa: E501

    The version of the OpenAPI document: v2
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import avalara.comms.rest.v2
from avalara.comms.rest.v2.models.tax import Tax  # noqa: E501
from avalara.comms.rest.v2.rest import ApiException

class TestTax(unittest.TestCase):
    """Tax unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test Tax
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = avalara.comms.rest.v2.models.tax.Tax()  # noqa: E501
        if include_optional :
            return Tax(
                bill = True, 
                cmpl = True, 
                tm = 1.337, 
                calc = 56, 
                cat = '0', 
                cid = 56, 
                name = '0', 
                exm = 1.337, 
                lns = 56, 
                min = 1.337, 
                pcd = 56, 
                taxpcd = 56, 
                rate = 1.337, 
                sur = True, 
                tax = 1.337, 
                lvl = 56, 
                tid = 56, 
                usexm = True, 
                notax = True, 
                trans = 56, 
                svc = 56, 
                chg = 1.337
            )
        else :
            return Tax(
        )

    def testTax(self):
        """Test Tax"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
