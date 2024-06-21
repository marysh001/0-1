import hashlib

def check_password(password):
    if len(password) < 8:
        return False
    if not any(char.isupper() for char in password):
        return False
    if not any(char.islower() for char in password):
        return False
    if not any(char.isdigit() for char in password):
        return False
    return True

def hash_password(password):
    return hashlib.sha256(password.encode()).hexdigest()

password = input("Введите свой пароль: ")

if check_password(password):
    hashed_password = hash_password(password)
    print(f"Пароль надежен. Хэшированное значение: {hashed_password}")
else:
    print("Пароль ненадежен. Пожалуйста, убедитесь, что он содержит не менее 8 символов и состоит из прописных и строчных букв и цифр.")