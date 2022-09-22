export class Company{
  id: number;
  name: string;
  country: string;
  email: string;

  constructor(id: number, name: string, country: string, email: string) {
    this.id = id;
    this.name = name;
    this.country = country;
    this.email = email;
  }
}
