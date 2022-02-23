# OOP_in_Java
<!DOCTYPE html>
<html lang="en">
<head>
    <title>OPP in Java</title>
    
<style>
*{
    margin: 0;
    padding: 0;
}

.main{
    width: 100%;
    background: linear-gradient(to top, rgba(0,0,0,0.5)50%,rgba(0,0,0,0.5)50%), url(https://images.unsplash.com/photo-1645497755820-9d7220b524d0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1374&q=80);

    background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    height: 100vh;
}

.navbar{
    width: 1200px;
    height: 75px;
    margin: auto;
}

.icon{
    width: 200px;
    float: left;
    height: 70px;
}

.logo{
    color: #ff7200;
    font-size: 35px;
    font-family: Arial;
    padding-left: 20px;
    float: left;
    padding-top: 10px;
    margin-top: 5px
}

.menu{
    width: 400px;
    float: left;
    height: 70px;
}

ul{
    float: left;
    display: flex;
    justify-content: center;
    align-items: center;
}

ul li{
    list-style: none;
    margin-left: 62px;
    margin-top: 27px;
    font-size: 14px;
}

ul li a{
    text-decoration: none;
    color: #fff;
    font-family: Arial;
    font-weight: bold;
    transition: 0.4s ease-in-out;
}

ul li a:hover{
    color: #ff7200;
}

.search{
    width: 330px;
    float: left;
    margin-left: 270px;
}

.srch{
    font-family: 'Times New Roman';
    width: 200px;
    height: 40px;
    background: transparent;
    border: 1px solid #ff7200;
    margin-top: 13px;
    color: #fff;
    border-right: none;
    font-size: 16px;
    float: left;
    padding: 10px;
    border-bottom-left-radius: 5px;
    border-top-left-radius: 5px;
}

.btn{
    width: 100px;
    height: 40px;
    background: #ff7200;
    border: 2px solid #ff7200;
    margin-top: 13px;
    color: #fff;
    font-size: 15px;
    border-bottom-right-radius: 5px;
    border-bottom-right-radius: 5px;
    transition: 0.2s ease;
    cursor: pointer;
}
.btn:hover{
    color: #000;
}

.btn:focus{
    outline: none;
}

.srch:focus{
    outline: none;
}

.content{
    width: 1200px;
    height: auto;
    margin: auto;
    color: #fff;
    position: relative;
}

.content .par{
    padding-left: 20px;
    padding-bottom: 25px;
    font-family: Arial;
    letter-spacing: 1.2px;
    line-height: 30px;
}

.content h1{
    font-family: 'Times New Roman';
    font-size: 50px;
    padding-left: 20px;
    margin-top: 9%;
    letter-spacing: 2px;
    color: #ff7200;

}

.content .cn{
    width: 160px;
    height: 40px;
    background: #ff7200;
    border: none;
    margin-bottom: 10px;
    margin-left: 20px;
    font-size: 18px;
    border-radius: 10px;
    cursor: pointer;
    transition: .4s ease;
    
}

.content .cn a{
    text-decoration: none;
    color: #000;
    transition: .3s ease;
}

.cn:hover{
    background-color: #fff;
}

.content span{
    color: #ff7200;
    font-size: 65px
}

.form{
    width: 290px;
    height: 400px;
    background: linear-gradient(to top, rgba(0,0,0,0.8)50%,rgba(0,0,0,0.8)50%);
    position: absolute;
    top: -20px;
    left: 870px;
    transform: translate(0%,-5%);
    border-radius: 10px;
    padding: 25px;
}

.form h2{
    width: 280px;
    font-family: sans-serif;
    text-align: center;
    color: #ff7200;
    font-size: 22px;
    background-color: #fff;
    border-radius: 10px;
    margin: 2px;
    margin-left: -1px;
    margin-top: 30px;
    padding: 7px;
}
.form h3{
    width: 280px;
    height: 35px;
    background: transparent;
    border-bottom: 1px solid #ff7200;
    border-top: none;
    border-right: none;
    border-left: none;
    color: #fff;
    font-size: 15px;
    letter-spacing: 1px;
    margin-top: 30px;
    font-family: sans-serif;
}

.form input:focus{
    outline: none;
}

::placeholder{
    color: #fff;
    font-family: Arial;
}

.btnn{
    width: 240px;
    height: 40px;
    background: #ff7200;
    border: none;
    margin-top: 30px;
    margin-left: 25px;
    font-size: 18px;
    border-radius: 10px;
    cursor: pointer;
    color: #fff;
    transition: 0.4s ease;
}
.btnn:hover{
    background: #fff;
    color: #ff7200;
}
.btnn a{
    text-decoration: none;
    color: #000;
    font-weight: bold;
}
.form .link{
    font-family: Arial, Helvetica, sans-serif;
    font-size: 17px;
    padding-top: 20px;
    text-align: center;
}
.form .link a{
    text-decoration: none;
    color: #ff7200;
}
.liw{
    padding-top: 15px;
    padding-bottom: 10px;
    text-align: center;
}
.icons a{
    text-decoration: none;
    color: #fff;
}
.icons ion-icon{
    color: #fff;
    font-size: 30px;
    padding-left: 14px;
    padding-top: 5px;
    margin-left: 7px;
    transition: 0.3s ease;
}
.icons ion-icon:hover{
    color: #ff7200;
}

</style>
</head>
<body>

    <div class="main">
        <div class="navbar">
            <div class="icon">
                <h2 class="logo">OOPinJava</h2>
            </div>

            <div class="menu">
                <ul>
                    <li><a href="https://github.com/asadali27232/OOP_in_Java/tree/main/Book%20Exercises">Book_Exercises</a></li>
                    <li><a href="https://github.com/asadali27232/OOP_in_Java/tree/main/LAB_Tasks">Lab_Task</a></li>
                    <li><a href="https://github.com/asadali27232/OOP_in_Java.git">GitHub_Repo</a></li>
                    <li><a href="https://lahore.comsats.edu.pk/Employees/941">Instructor</a></li>
                    <li><a href="https://sites.google.com/cuilahore.edu.pk/object-oriented-programming/home">Course_Site</a></li>
                </ul>
            </div>

        </div> 
        <div class="content">
            <h1>Java <br> Object Oriented Programming  <br> Code</h1>
            <p class="par">The main ideas behind Java's Object-Oriented Programming,<br>
                           OOP concepts include abstraction, encapsulation, inheritance<br>
                           and polymorphism. Basically, Java OOP concepts let us create<br> 
                           working methods and variables, then re-use all or part of them<br>
                           without compromising security.</p>

                <button class="cn"><a href="https://github.com/asadali27232/OOP_in_Java.git">My Code</a></button>

                <div class="form">
                    <h2>Developer: Asad Ali</h2>
                    <h3>asadali27232@gmail.com</h3>
                    <h3>sp21-bcs-007@cuilahore.edu.pk</h2>
                    <button class="btnn"><a href="https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox?compose=new">Send Mail</a></button>
                    
                    <div><p><br></p></div>
                    <div><p><br> </p></div>
                    <div><p><br> </p></div>
                    
                    <div class="icons">
                        <a href="https://www.facebook.com/asadalighaffar"><ion-icon name="logo-facebook"></ion-icon></a>
                        <a href="https://www.instagram.com/asadali27232/"><ion-icon name="logo-instagram"></ion-icon></a>
                        <a href="https://www.linkedin.com/in/asad-ali-7773371b1/"><ion-icon name="logo-linkedin"></ion-icon></a>
                        <a href="https://github.com/asadali27232"><ion-icon name="logo-github"></ion-icon></a>
                        <a href="https://wa.link/k14yyw"><ion-icon name="logo-whatsapp"></ion-icon></a>


                    </div>

                </div>
                    </div>
                </div>
        </div>
    </div>
    <script src="https://unpkg.com/ionicons@5.4.0/dist/ionicons.js"></script>
</body>
</html>
