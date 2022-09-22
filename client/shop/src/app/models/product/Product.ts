import {Type} from "../type/Type";
import {Company} from "../company/Company";
import {Chipset} from "../chipset/Chipset";
import {Image} from "../image/Image";

export class Product {
  id: number;
  name: string;
  price: bigint;
  description: string;
  amount: number;
  type: Type;
  company: Company;
  chipset: Chipset;
  images: Image[];

  constructor(id: number, name: string, price: bigint, description: string, amount: number, type: Type, company: Company, chipset: Chipset, images: Image[]) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.description = description;
    this.amount = amount;
    this.type = type;
    this.company = company;
    this.chipset = chipset;
    this.images = images;
  }
}
