  // 할일 불러오기
  function loadTodo() {
    $.ajax({
      url: "http://127.0.0.1:8080/todo",
      method: "get",
      // 전달할 data 없기 때문에 비워둠. 
      data: {},
      success: function (x) {
        console.log(x);

        const divTag = document.querySelector("#todoArea");

        let str = "";
        for (let i = 0; i < x.length; i++) {
          str += "<h3>" + x[i].no + "/" + x[i].content + "</h3>";
        }
        divTag.innerHTML = str;
      },
    });
  }