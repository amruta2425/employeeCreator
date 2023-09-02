export type Employee = {
    readonly id: number;
    firstName: string;
    middleName: string;
    lastName: string;
    email: string;
    mobileNumber: string;
    address: string;
    startDay?: string;
    startMonth?: string;
    startYear?: string;
    finishDay?: string;
    finishMonth?: string;
    finishYear?: string;
    startDate: Date;
    finishDate: Date;
    hours: number;
    timeBasis: string;
    contractType: string;
    ongoing: boolean;
  };
  