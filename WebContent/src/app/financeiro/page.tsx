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

import React from "react";
import PageTitle from "@/components/PageTitle";

export default function FinanceiroPage() {
  return (
    <div className=" flex flex-col gap-5 w-full">
      <PageTitle title="Financeiro" />
      <div className="h-[720px] w-[1250px] relative after:content-[''] after:w-full after:h-16 after:bg-white after:absolute after:bottom-0 after:left-0 after:z-10">
        <iframe 
          width="1250" 
          height="720" 
          src="https://app.powerbi.com/view?r=eyJrIjoiZjk3ZmE2ZGYtN2JiMS00ZjY4LWI1YjYtMmJlYmUwY2E2OWU3IiwidCI6ImUyZjc3ZDAwLTAxNjMtNGNmNi05MmIwLTQ4NGJhZmY5ZGY3ZCJ9" 
          frameBorder="0" 
          className="" 
          allowFullScreen={true} >
        </iframe>
      </div>  
      {/* <iframe title="projeto_contabilidade" width="1140" height="541.25" src="" frameBorder="0" allowFullScreen={true}></iframe> */}
      {/* <iframe 
        className=""
        title="projeto_contabilidade" 
        width="1180" 
        height="700.25" 
        src="https://app.powerbi.com/reportEmbed?reportId=f5f8da51-8d01-4371-bde4-ee0ab84a7fd3&ctid=e2f77d00-0163-4cf6-92b0-484baff9df7d&filterPaneEnabled=false&navContentPaneEnabled=false" frameBorder="0" allowFullScreen={true}></iframe> */}
    </div>
  );
}
