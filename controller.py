import view
import database

def main():
    while True:
        ask =view.user_input()
        if ask == 1:
            data = view.note()
            database.add_dat(data)
elif ask == 2:
name = view.search()
database.search_info(info)
elif ask == 3:
database.delete_datab_info(info)
elif ask == 4:
database.change_datab_info(info)
break

            