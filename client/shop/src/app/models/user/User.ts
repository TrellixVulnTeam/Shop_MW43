export class User {
  id: number;
  username: string;
  firstname: string;
  lastname: string;
  patronymic: string;
  telephone: string;
  birthday: string;
  jwt: string;

  constructor(id: number,
              username: string,
              firstname: string,
              lastname: string,
              patronymic: string,
              telephone: string,
              birthday: string,
              jwt: string) {
    this.id = id;
    this.username = username;
    this.firstname = firstname;
    this.lastname = lastname;
    this.patronymic = patronymic;
    this.telephone = telephone;
    this.birthday = birthday;
    this.jwt = jwt;
  }

}
