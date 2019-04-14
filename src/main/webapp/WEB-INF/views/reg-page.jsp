<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Simple Sidebar - Start Bootstrap Template</title>

    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="../assets/css/simple-sidebar.css" rel="stylesheet">
    <link rel="stylesheet" href="../assets/css/custom.css">
    <link rel="stylesheet" href="../assets/css/reg.css">

</head>

<body>
<div class="d-flex" id="wrapper">

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
                    <li class="nav-item">
                        <a class="nav-link btn login-modal" href="#myModal" data-toggle="modal">вход/регистрация</a>
                    </li>
                </ul>
            </div>
        </nav>
        <div class="container-fluid">

            <!-- Кнопка, вызывающее модальное окно -->
            <!--<a href="#myModal" class="btn btn-primary" data-toggle="modal">Модальное окно</a>-->

            <!-- HTML-код модального окна -->
            <div id="myModal" class="modal fade">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <!-- Заголовок модального окна -->
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                        </div>







                        <!-- Футер модального окна -->
                        <div class="modal-footer">
                            <ul id="myTab" class="nav nav-tabs">
                                <!--<li class="active"><a href="#panel1">Панель 1</a></li>
                                <li><a href="#panel2">Панель 2</a></li>-->
                                <li class="btn btn-info reg-author-but">
                                    <a href="#panel1" data-dismiss="" class="active">вход</a>
                                    <!--<button type="button" class="btn btn-info reg-author-but" data-dismiss="modal">вход</button>-->
                                </li>
                                <li class="btn btn-info reg-author-but">
                                    <a href="#panel2" data-dismiss="">регистрация</a>
                                    <!--<button type="button" class="btn btn-info reg-author-but" data-dismiss="modal">регистрация</button>-->
                                </li>
                            </ul>
                        </div>
                        <!-- Основное содержимое модального окна -->
                        <div class="tab-content">
                            <div id="panel1" class="tab-pane fade in active show">
                                <div class="modal-body">
                                    <h2>вход</h2>
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text" id="emaillogin-label">Email</span>
                                        </div>
                                        <input id="emaillogin" type="email" class="form-control" placeholder="thetruesportsman@gmail.com" aria-label="Username" aria-describedby="basic-addon1">
                                    </div>
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text" id="passwordlogin-label">пароль</span>
                                        </div>
                                        <input id="passwordlogin" type="password" class="form-control" placeholder="type your password here" aria-label="Username" aria-describedby="basic-addon1">
                                    </div>
                                </div>
                            </div>
                            <div id="panel2" class="tab-pane fade">
                                <div class="modal-body">
                                    <h2>регистрация</h2>
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text" id="emailaregister-label">Email</span>
                                        </div>
                                        <input id="emailaregister" type="email" class="form-control" placeholder="thetruesportsman@gmail.com" aria-label="Username" aria-describedby="basic-addon1">
                                    </div>
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text" id="nameregister-label">имя</span>
                                        </div>
                                        <input id="nameregister" type="name" class="form-control" placeholder="Jack" aria-label="Username" aria-describedby="basic-addon1">
                                    </div>
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text" id="passwordregister-label">пароль</span>
                                        </div>
                                        <input id="passwordregister" type="password" class="form-control" placeholder="type your password here" aria-label="Username" aria-describedby="basic-addon1">
                                    </div>
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text" id="passwordregister2-label">повторите пароль</span>
                                        </div>
                                        <input id="passwordregister2" type="password" class="form-control" placeholder="type your password here" aria-label="Username" aria-describedby="basic-addon1">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--<div class="modal-footer">
                            <button type="button" class="btn btn-info" data-dismiss="modal">Закрыть</button>
                        </div>-->
                    </div>
                </div>
            </div>


        </div>
    </div>
    <!-- /#page-content-wrapper -->
</div>
<!-- /#wrapper -->
<div class="navbar navbar-default navbar-fixed-bottom" style="background-color:#000000;">
    <div class="container">
        <p class="navbar-text pull-left">© 2019 - Копирайт
            <a href="http://tinyurl.com/tbvalid" target="_blank" >пользовательское соглашение</a>
        </p>
        <a href="/" class="navbar-btn btn-danger btn pull-right">
            <span class="fa fa-star"></span> очень важная кнопка</a>
    </div>
</div>
<!-- Bootstrap core JavaScript -->
<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/bootstrap.bundle.min.js"></script>
<script src="../assets/js/reg.js"></script>
<!-- Menu Toggle Script -->
<script>
    //$(".menu-toggle").click(function(e) {
    //e.preventDefault();
    //$("#wrapper").toggleClass("toggled");
    //});
</script>
</body>
</html>