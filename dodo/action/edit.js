  //수정하기 
  function edit(todoNumber){

    const editNo = todoNumber;
    const changeContent = document.querySelector("textarea[name=changeContent]").value;


    $.ajax({
      url: "http://127.0.0.1:8080/todo",
      method: "put",
      data: {
        no: editNo,
        content: changeContent,
      },
      success: function(data){
        console.log(data);
      },
    });
  }