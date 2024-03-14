/**
 * eslint-disable @next/next/no-img-element
 *
 * @format
 */

/**
 * eslint-disable @next/next/no-img-element
 *
 * @format
 */

/** @format */
"use client";

import { DataTable } from "@/components/DataTable";
import { ColumnDef } from "@tanstack/react-table";
import React from "react";
import PageTitle from "@/components/PageTitle";
import { cn } from "@/lib/utils";

type Props = {};

interface Setting {
  category: string;
  value: string | number | boolean;
}

const columns: ColumnDef<Setting>[] = [
  {
    accessorKey: "category",
    header: "Category"
  },
  {
    accessorKey: "value",
    header: "Value"
  }
];
const data: Setting[] = [
  {
    category: "Account",
    value: true
  },
  {
    category: "Notifications",
    value: false
  },
  {
    category: "Language",
    value: "English"
  },
  {
    category: "Theme",
    value: "Dark"
  }
];

export default function RecursosPage({}: Props) {
  return (
    <div className="flex flex-col gap-5  w-full">
      <PageTitle title="Recursos" />
      <div className="h-[720px] w-[1250px] relative after:content-[''] after:w-full after:h-16 after:bg-white after:absolute after:bottom-0 after:left-0 after:z-10">
        <iframe 
          width="1250" 
          height="720" 
          src="https://app.powerbi.com/view?r=eyJrIjoiZjk3ZmE2ZGYtN2JiMS00ZjY4LWI1YjYtMmJlYmUwY2E2OWU3IiwidCI6ImUyZjc3ZDAwLTAxNjMtNGNmNi05MmIwLTQ4NGJhZmY5ZGY3ZCJ9&pageName=ReportSection28e2c21d89409c61b98b" 
          frameBorder="0" 
          className="" 
          allowFullScreen={true} >
        </iframe>
      </div>  
    </div>
  );
}
