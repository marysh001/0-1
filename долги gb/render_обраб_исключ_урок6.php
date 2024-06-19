<?php
$file = './users.csv';

function loadUsersFromFile(string $file): array {
    // Файла не существует — ошибка
    if (!file_exists($file)) {
        return [
            'success'   =>  false,
            'error'     =>  "файл $file не существует"
        ];
    }

    return [
        'success'   =>  true,
        'users'    =>  $users
    ];
}
// Загружаем список пользователей в массив
$result = loadUsersFromFile($file); 

// можно еще писать if (!$result['success'])
if ($result['success'] === false) {  
    // Выводим текст ошибки
    die("Не удалось вывести список пользователей из-за ошибки: {$result['error']}\n");
}

$users = $result['users'];

if (!file_exists($file)) {
    throw new Exception("Ошибка: файл $file не существует");
}