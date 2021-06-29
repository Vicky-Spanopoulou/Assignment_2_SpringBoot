
$(document).ready(function(){
                
// ---------------- alert if trainer already exists in the db ------------------

    
    $("#fname, #lname").focusout(function(){
        var fname = $("#fname").val();
        var lname = $("#lname").val();
        $.ajax({
            url:"checkname/" + lname + "/" + fname,
            success: function(result){
                if (result){
                    alert("This trainer already exists");
//                    $("#a").html("This trainer already exists");
                    
                }
//                else{
//                    $("#savebtn").click(function(){
//                        alert("The trainer has been saved successfuly!");
//                    });
//                }
            }
        });
    });
});
            


