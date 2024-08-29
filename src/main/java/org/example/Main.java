package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//                      regionDetails.merge(regionName, new HashSet<>(usageSet), (existingUsage, newUsage) -> {
//        existingUsage.addAll(newUsage);
//        return existingUsage;
//        });
//        what is this actual doing





//        Map<String, AttributeValue> expressionAttributeValues = new HashMap<>();
//        expressionAttributeValues.put(":regionCode", AttributeValue.builder().s("eu-west-3").build());
//
//        ScanRequest scanRequest = ScanRequest.builder()
//                .tableName("YourTableName")
//                .filterExpression("contains(regions, :regionCode)")
//                .expressionAttributeValues(expressionAttributeValues)
//                .build();
//
//        ScanResponse response = dynamoDbClient.scan(scanRequest);
//        List<Map<String, AttributeValue>> items = response.items();
//
//        for (Map<String, AttributeValue> item : items) {
//            // Process each item
//            System.out.println(item);
//        }

