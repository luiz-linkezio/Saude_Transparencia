import React, { ChangeEvent, DragEvent, useState } from 'react';

const FileUploader = () => {
  const [selectedFile, setSelectedFile] = useState<File | null>(null);

  const handleFileChange = (e:  ChangeEvent<HTMLInputElement>) => {
    setSelectedFile(e.target.files![0]);
  };

  const handleFileDrop = (e: DragEvent<HTMLDivElement>) => {
    e.preventDefault();
    const file = e.dataTransfer.files[0];
    setSelectedFile(file);
  };

  const handleDragOver = (e: DragEvent<HTMLDivElement>) => {
    e.preventDefault();
  };

  return (
    <div>
      <div
        className="drop-area border border-gray-400 p-8 border-dashed dashed rounded-md text-center cursor-pointer"
        onDrop={handleFileDrop}
        onDragOver={handleDragOver}
      >
        <input
          type="file"
          accept=".jpg, .jpeg, .png, .csv, .pdf"
          className="mb-4"
          onChange={handleFileChange}
        />
        {selectedFile ? (
          <p className='text-gray-500 text-bold'>Arquivo selecionado: {selectedFile.name}</p>
        ):(
          <p className='text-black/75 text-bold'>Ou arraste e solte o CSV aqui</p>
        )}
      </div>
    </div>
  );
};

export default FileUploader;
