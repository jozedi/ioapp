#!/bin/bash

createFile () {
    FilePath="$1/.gitkeep"
    echo "Verificando si existe el archivo $FilePath"
    
    if [[ -f "$FilePath" ]]; then
        echo "El archivo $FilePath ya existe"
        return
    fi

    echo "Creando archivo $FilePath"
    touch ${FilePath}
    echo "Archivo creado -> $FilePath"
}

createFolder () {
    FolderPath=$1
    echo "Verificando si existe el folder $FolderPath"
    
    if [[ -d "$FolderPath" ]]; then
        echo "El folder $FolderPath ya existe"
    else
        echo "Creando folder $FolderPath"
        mkdir ${FolderPath}
        echo "Folder creado -> $FolderPath"
    fi

    createFile ${FolderPath}
}

echo "versión 1.0.1"

if [[ "$1" == "" ]]; then
    echo "Debe incluir el nombre del feature"
    exit
fi

FeatureName=$1

#Folder feature
createFolder "$FeatureName"

#Folder di
createFolder "$FeatureName/di"

#Folder presentation
createFolder "$FeatureName/presentation"
createFolder "$FeatureName/presentation/adapter"
createFolder "$FeatureName/presentation/mapper"
createFolder "$FeatureName/presentation/model"
createFolder "$FeatureName/presentation/view"

#Folder domain
createFolder "$FeatureName/domain"
createFolder "$FeatureName/domain/di"
createFolder "$FeatureName/domain/repository"
createFolder "$FeatureName/domain/entities"
createFolder "$FeatureName/domain/usecases"

#Folder data
createFolder "$FeatureName/data"
createFolder "$FeatureName/data/di"
createFolder "$FeatureName/data/mapper"
createFolder "$FeatureName/data/repository"
createFolder "$FeatureName/data/datasource"
createFolder "$FeatureName/data/datasource/local"
createFolder "$FeatureName/data/datasource/cloud"