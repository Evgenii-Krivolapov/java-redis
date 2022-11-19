Цель задания:
Научиться работать в Java с Redis.


Условия задания:
На сайте знакомств зарегистрировалось 20 пользователей. Показывайте их по очереди на главной странице сайта.
По умолчанию порядок очереди зависит от времени регистрации на сайте. После каждого показа пользователь отправляется в конец очереди.
Пользователь может оплатить услугу по перемещению в начало очереди.


Что нужно сделать:
Напишите программу, которая будет эмулировать работу такого сайта, хранить очередь в Redis и выводить лог операций в консоль.


Программа должна запускать бесконечный цикл, в котором:
- Выводится в консоль номер пользователя, которого нужно отобразить на главной странице. 
- В одном из 10 случаев случайный пользователь оплачивает услугу, в консоль выводится его номер.
Программа ждёт 1 секунду, и цикл начинается заново.
