def user_input():
    ask = int(input("Выбери ниже\n 1 - новая заметка \n" "2 - поиск заметки \n" 
                     "3 - удалить заметку\n " "4- изменить заметку\n"))
    return ask

def input_note():

    return str

def note(): 
                data = list()
                info = input("Введите текст: ")
                date = input("введите дату")
                data.append(info, date)
                return data
d = note()
print(d)

def search_note_info():
        str_search = input("Введите текст для поиска:")
        return str_search
def delete_datab_info():
        str_delete = input("удалите ненужные данные: ")
        return str_delete
def change_datab_info():
        str_change = input("введите новые данные: ")
        return str_change