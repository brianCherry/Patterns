/**
 * Created by bcherry on 9/21/16.
 */

json = {
	"id" : "7e04fbcb-bc3d-42db-9f39-72dff5922320",
	"eventType" : "OrderCreated",
	"version" : 1,
	"payload" : {
	"header" : {
		"orderStatus" : "COMPLETED",
			"storeCode" : "sendportal",
			"createdDate" : "2016-09-14T11:28:18Z",
			"locale" : "en",
			"currency" : "USD",
			"orderNumber" : "23013",
			"externalOrderNumber" : "93E87D5EC5D14CA889A1F689836C49",
			"orderSource" : null,
			"emailFrom" : "sendportal@lifeway.com",
			"csrUserId" : null,
			"totalItemCostBeforeTax" : 99,
			"totalShippingCostBeforeTax" : 0,
			"totalItemTaxes" : 9.16,
			"totalShippingTaxes" : 0,
			"totalTaxes" : 9.16,
			"totalItemCostIncludingTax" : 108.16,
			"totalShippingCostIncludingTax" : 0,
			"grandTotal" : 108.16
	},
	"customer" : {
		"customerId" : "0ba745de-dbeb-4018-a76e-1835843d9581",
			"customerUserName" : "0ba745de-dbeb-4018-a76e-1835843d9581",
			"firstName" : "118pp7dh",
			"lastName" : "1H1ZDJGB",
			"email" : "z92tremr5bykfxgau8ealz7l@mail.mapil.co"
	},
	"shipments" : [ {
		"shipmentId" : "23013-1",
		"shipmentStatus" : "SHIPPED",
		"shippingCost" : null,
		"discountAmount" : 0,
		"serviceLevel" : null,
		"shippingAddress" : null,
		"shipmentType" : "DIGITAL",
		"shipmentCompleteDate" : null,
		"shipmentCarrier" : null,
		"trackingReference" : null,
		"lineItems" : [ {
			"lineItemId" : "2b23c1d6-b12d-4a97-8905-f94a7cd29b4e",
			"parentLineItemId" : null,
			"productCode" : "SP_NAMBCPIA000001",
			"itemCode" : "006141831",
			"quantity" : 1,
			"listUnitPrice" : 99,
			"saleUnitPrice" : null,
			"unitPrice" : 99,
			"itemSubtotalPrice" : 99,
			"amountBeforeTax" : 99,
			"itemTaxes" : 9.16,
			"amountIncludingTax" : 108.16,
			"amount" : null,
			"displayName" : "NAMB Church Planter Initial Assessment",
			"options" : [ {
				"key" : "MaritalStatus",
				"value" : "Married",
				"displayValue" : null
			} ],
			"taxLines" : [ {
				"jurisdictionId" : "STATE",
				"taxRegionId" : "TENNESSEE",
				"taxIsInclusive" : false,
				"taxName" : "Sales and Use Tax",
				"taxCode" : "NONE",
				"taxAmount" : 6.93,
				"taxRate" : 0.07,
				"taxCalculationDate" : "2016-09-14T11:28:18Z"
			}, {
				"jurisdictionId" : "STATE",
				"taxRegionId" : "TENNESSEE",
				"taxIsInclusive" : false,
				"taxName" : "State Single Article Tax",
				"taxCode" : "NONE",
				"taxAmount" : 0,
				"taxRate" : 0,
				"taxCalculationDate" : "2016-09-14T11:28:18Z"
			}, {
				"jurisdictionId" : "COUNTY",
				"taxRegionId" : "DAVIDSON",
				"taxIsInclusive" : false,
				"taxName" : "Local Sales and Use Tax",
				"taxCode" : "NONE",
				"taxAmount" : 2.23,
				"taxRate" : 0.0225,
				"taxCalculationDate" : "2016-09-14T11:28:18Z"
			} ]
		} ]
	} ],
		"addresses" : [ {
		"addressId" : "74c2d26c-1897-497f-ad4b-45e9b6998fa4",
		"addressUsage" : "BILLING",
		"addressType" : null,
		"externalAddressId" : null,
		"firstName" : "118pp7dh",
		"lastName" : "1H1ZDJGB",
		"organization" : null,
		"street1" : "One Lifeway Plaza",
		"street2" : "",
		"city" : "Nashville",
		"region" : "TN",
		"country" : "US",
		"zipPostalCode" : "37234",
		"phoneNumber" : null
	}, {
		"addressId" : "74c2d26c-1897-497f-ad4b-45e9b6998fa4",
		"addressUsage" : "SHIPPING",
		"addressType" : "Residential",
		"externalAddressId" : "11111111-1111-1111-111111111111",
		"firstName" : "118pp7dh",
		"lastName" : "1H1ZDJGB",
		"organization" : "Lifeway",
		"street1" : "One Lifeway Plaza",
		"street2" : "",
		"city" : "Nashville",
		"region" : "TN",
		"country" : "US",
		"zipPostalCode" : "37234",
		"phoneNumber" : "615-555-5555"
	} ],
		"payments" : [ {
		"paymentId" : "206199",
		"amount" : 108.16,
		"transactionType" : "PASS_THROUGH",
		"transactionDate" : "2016-09-14T11:28:19Z",
		"paymentStatus" : "SUCCESS",
		"paymentMethod" : {
			"@class" : "com.elasticpath.repo.order.xml.binding.TokenPaymentMethod",
			"paymentType" : "TOKEN",
			"fields" : [ {
				"key" : "paymentToken",
				"value" : "2000959573",
				"displayValue" : "accountNumber"
			} ]
		},
		"shipmentId" : "23013-1"
	} ]
},
	"timestamp" : "2016-09-14T11:28:19.042Z"
}
