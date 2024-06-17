import view
import database

def add_dat():
with open("datab.txt", "a") as file:
    file.write(data)
    print("заметка сохранена")

    def search_info(info):
        with open("datab.txt", "r") as file:
       data = file.readlines()
    flag = False
    for i in data:
        if name in i:
            print (i)
            flag = True
            if flag == false ("Заметка не найдена\n")

                        def delete_datab_info():
                                  with open("datab.txt","r") as file:
                    data = file.readlines()
                    data.delete()
                    data.copy(key= lambda x: x[1])
                    with open("datab.txt", "w") as file:
                        file.writelines(data)
                        file.save(data)
                        print(file.read)

                         def change_datab_info():
                                  with open("datab.txt","r") as file:
                    data = file.writelines()
                    data.change()
                    data.copy(key= lambda x: x[1])
                    with open("datab.txt", "w") as file:
                        file.writelines(data)
                        file.save(data)
                        print(file.read)