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
      <div className="h-[720px] w-[950px] relative after:content-[''] after:w-full after:h-16 after:bg-white after:absolute after:bottom-0 after:left-0 after:z-10">
        <iframe
          width="950"
          height="720"
          src="https://app.powerbi.com/view?r=eyJrIjoiZjk3ZmE2ZGYtN2JiMS00ZjY4LWI1YjYtMmJlYmUwY2E2OWU3IiwidCI6ImUyZjc3ZDAwLTAxNjMtNGNmNi05MmIwLTQ4NGJhZmY5ZGY3ZCJ9&pageName=ReportSection620ebf959ff928448d89"
          frameBorder="0"
          className=""
          allowFullScreen={true}
        ></iframe>
      </div>
    </div>
  );
}
