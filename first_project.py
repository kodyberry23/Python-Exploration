def make_person(name, age):
    return {"name": name, "age": age}



person_one = make_person("Kyle Berry", 25)

person_two = make_person("Kody Berry", 25)

person_three = make_person("Tyler Berry", 28)


brothers_list = [person_one, person_two, person_three]


for brother in brothers_list:
        print(f'Made person with name: {brother["name"]} and an age of: {brother["age"]}')