## 1.Используя команду cat в терминале операционной системы Linux,создать два файла Домашние животные(заполнив файл собаками,кошками, хомяками)и Вьючные животными заполнив файл Лошадьми,верблюдами и ослы), а затем объединить их.Просмотреть содержимое созданного файла. Переименовать файл, дав ему новое имя (Друзья человека). 
## 2.Создать директорию,переместить файл туда.

poludnica@poludnica-Linux:~$ cat pet.txt\
собака Маркиз \
собака Боня\
кошка Бакс\
кошка Барсик\
хомяк Хома\

poludnica@poludnica-Linux:~$ cat pack_animals.txt\
лошадь Седогрив\
лошадь Маузер\
верблюд Яхонт\
осел Хой\

poludnica@poludnica-Linux: cat pet.txt pack_animals.txt > human_friends\
poludnica@poludnica-Linux: cat human_friends\
собака Маркиз\
собака Боня\
кошка Бакс\
кошка Барсик\
хомяк Хома\
лошадь Седогрив\
лошадь Маузер\
верблюд Яхонт\
осел Хой\

#### poludnica@poludnica-Linux: mkdir animals\
#### poludnica@poludnica-Linux: mv human_friends animals\
#### poludnica@poludnica-Linux: cd animals\
#### poludnica@poludnica-Linux:animals$ ls\
#### human_friends
------
## 3.Подключить дополнительный репозиторий MySQL.Установить любой пакет из этого репозитория.
## 4. Установить и удалить deb-пакет с помощью dpkg.

poludnica@poludnica-Linux:~$ wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb

  poludnica@poludnica-Linux:~$ sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb

  poludnica@poludnica-Linux:~$ sudo apt install mysql-server mysql-client

  poludnica@poludnica-Linux:~$ systemctl status mysql.service
  ● mysql.service - MySQL Community Server
       Loaded: loaded (/lib/systemd/system/mysql.service; enabled; vendor preset:>
       Active: active (running) since Fri 2024-02-02 19:17:09 MSK; 11min   ago\
     Main PID: 976 (mysqld)\
     Status: "Server is operational"\
      Tasks: 37 (limit: 2261)\
     Memory: 189.1M\
        CPU: 18.259s\
     CGroup: /system.slice/mysql.service\
             └─976 /usr/sbin/mysqld\

фев 02 19:17:04 poludnica-Linux systemd[1]: Starting MySQL Community Server...\
фев 02 19:17:09 poludnica-Linux systemd[1]: Started MySQL Community Server.\

poludnica@poludnica-Linux:~$ wget https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-j_8.0.32-1ubuntu22.04_all.deb\

poludnica@poludnica-Linux:~$ sudo dpkg -i mysql-connector-j_8.0.32-1ubuntu22.04_all.deb\
poludnica@poludnica-Linux:~$ sudo dpkg -r mysql-connector-j\
(Чтение базы данных … на данный момент установлено 189275 файлов и каталогов.)\
Удаляется mysql-connector-j (8.0.32-1ubuntu22.04) …\

------ 

## 5. Выложить историю команд в терминале ubuntu

poludnica@poludnica-Linux:~$ history\

------

## 6.Нарисовать диаграмму, в которой есть класс родительский класс, домашние животные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы).\ 

<image src="dia.jpg" alt="Текст с описанием картинки">


