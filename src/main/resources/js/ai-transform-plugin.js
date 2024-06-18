AJS.$(document).ready(function() {
    AJS.$('#ai-transform-button').click(function() {
        var description = AJS.$('#description').val();
        console.log('Button clicked. Description:', description); // Debugging line
        // Call your LLM API here with the description
        // Replace the description field value with the transformed data
        AJS.$.ajax({
            url: '######',  // Your LLM API endpoint
            type: 'POST',
            data: JSON.stringify({ description: description }),
            contentType: 'application/json',
            success: function(data) {
                console.log('API Response:', data); // Debugging line
                AJS.$('#description').val(data.transformedDescription);
            },
            error: function(error) {
                console.error('Error:', error);
            }
        });
    });
});
