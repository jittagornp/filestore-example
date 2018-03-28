# filestore-example
ตัวอย่างการใช้ library filestore https://github.com/pamarin-tech/filestore

### Upload File

Http `POST`
> /{API_PREFIX}/upload

![upload](image/upload.jpg)


### Get File

http `GET`
> /{API_PREFIX}/{createdDate}/{uuid}.{extensionFile}

![upload](image/get-file.jpg)

### File exist 

http `GET`
> /{API_PREFIX}/{createdDate}/{uuid}.{extensionFile}/exist 

![upload](image/exist.jpg)

### Delete File 

http `DELETE`
> /{API_PREFIX}/{createdDate}/{uuid}.{extensionFile}/delete   

![upload](image/delete.jpg)
