Scenario: Авторизация на Mail.ru и отправка нового письма с указанием получателя и темы.
Given пользователь открывает главную станицу mail.ru
When пользователь вводит login: 'vladnaldin' и password: 'crimetime111'
Then происходит авторизация пользователя


