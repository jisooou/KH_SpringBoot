//할일 등록하기
function insertTodo() {

  const contentValue = document.querySelector("input[name=content]").value;
  document.querySelector("input[name=content]").value = "";


  $.ajax({
    url: "http://127.0.0.1:8080/todo",
    method: "post",
    data: {
      content: contentValue
      //content: "밥먹기"
    },
    success: function (x) {
      console.log(x);
      loadTodo();
    },
  });
}