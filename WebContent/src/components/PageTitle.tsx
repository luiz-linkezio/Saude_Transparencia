/** @format */

import { cn } from "@/lib/utils";
import { Bell, Upload } from "lucide-react";
import Image from "next/image";
import React from "react";

type Props = {
  title: string;
  className?: string;
};

export default function PageTitle({ title, className }: Props) {
  return (
    <>
      <div className="flex justify-between items-center">
        <h1 className={cn("text-2xl font-semibold", className)}>{title}</h1>
        <div className="flex gap-4 items-center justify-center">
          <Upload size={20} className="cursor-pointer"/>
          <Bell size={20} className="cursor-pointer"/>
          <Image 
            src="https://github.com/Dev-JoseRonaldo.png" 
            alt="Profile Picture" 
            width={32} 
            height={32}  
            className="rounded cursor-pointer"/>
        </div>
      </div>
      <div className="h-1 w-full border-b-[1px] border-black/25 mb-1"></div>
    </>
  
  );
}
