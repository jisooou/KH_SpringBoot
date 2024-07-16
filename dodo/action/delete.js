  // 삭제하기 
  function del(delNo){
    $.ajax({
      url: "http://127.0.0.1:8080/todo",
      method: "delete",
      data: {
        no: delNo
      },
      success: function(x){
        console.log(x);
      },
    });
  }