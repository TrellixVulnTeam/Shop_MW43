export class Image {
  id: number;
  description: string;
  path_to_file: string;

  constructor(id: number, description: string, path_to_file: string) {
    this.id = id;
    this.description = description;
    this.path_to_file = path_to_file;
  }


}
